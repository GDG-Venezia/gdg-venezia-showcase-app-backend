# gdg-venezia-showcase-app-backend
A backend for GDG Venezia showcase app written in Kotlin(with Ktor)

# Build a Fat-Jar
- `apply plugin: 'com.github.johnrengelman.shadow'`
- configure `shadowJar` gradle task
- `gradle assembleShadowDist`

# Deploy on Heroku

- Install Heroku CLI: `brew tap heroku/brew && brew install heroku`
- Test installation: `heroku --version`
- Create file `app.js`
- Create file `Procfile`
- Create file `system.property`
- Configure gradle task for Heroku: `assembleShadowDist`
- Test locally: `heroku local:start`
- Use `heroku create` to create an app with random name
- Push your git changes to the Heroku remote: `git push heroku master`
- Open the remote application: `heroku open`