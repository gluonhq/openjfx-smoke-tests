# openjfx-smoke-tests

Tests to run against OpenJFX SDK, JMODS and Maven artifacts.

The deployment with the specified id as workflow i/p will be published automatically when all tests pass.

To start a new test:
- Go to https://github.com/gluonhq/openjfx-smoke-tests/actions/workflows/build.yml
- Click on 'Run workflow'
- Provide the JavaFX version to run the tests against
- Provide `maven_deployment_id` if artifacts needs to be published after running the tests

Then run workflow.
