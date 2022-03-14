const puppeteer = require('puppeteer');

(async () => {
  const browser = await puppeteer.launch({
  args:[
         '--start-fullscreen' // you can also use ''
      ]
 });
  const page = await browser.newPage();
  await page.setViewport({
    width: 1900,
    height: 12534,
    deviceScaleFactor: 1,
  });
  await page.goto('https://github.com/puppeteer/puppeteer');
  await page.screenshot({ path: 'example.png' });

  await browser.close();
})();