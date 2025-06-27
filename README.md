# openjfx-smoke-tests

Tests to run against OpenJFX SDK, JMODS and Maven artifacts.
The deployment with the specified id in settings.properties will be published automatically when all tests pass.

To start a new test:
- edit `settings.properties` 
- update the versions you want to test
- change `maven_deployment_id` to the deployment id that needs to be published after running the tests

Then commit and push to trigger the actions workflow. 
