/*
 * @CreatAuthor: wanghao
 * @UpdateAuthor: (...)
 * @Description: 接口反向代理配置
 */
const { createProxyMiddleware } = require('http-proxy-middleware');
module.exports = function (app) {
  app.use(
    // 反向代理配置
    createProxyMiddleware('/mes', {
      // 接口地址
      target: 'http://localhost:8080',
      changeOrigin: true,
      ws: true,
      pathRewrite: {
        '^/mes': '/mes',
      },
    })
  );
};
