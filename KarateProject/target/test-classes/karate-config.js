function fn() {
  var env = karate.env; // get system property 'karate.env'
  karate.log('karate.env system property was:', env);
  if (!env) {
    env = 'dev';
  }
  var config = {
    
    URL: 'https://simple-grocery-store-api.glitch.me',
    env: env,
    myVarName: 'someValue',
    TokenId: '6d26c22be6a27f24dacb861871d9aee78592b800cc7cf04198a9b07822b8783b'
  }
  if (env == 'dev') {
    // customize
    // e.g. config.foo = 'bar';
  } else if (env == 'e2e') {
    // customize
  }
  return config;
}