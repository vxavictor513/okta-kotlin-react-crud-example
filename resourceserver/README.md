## Building Docker Image and Push to GitHub Container Registry (ghcr.io)

```shell script
gradle bootBuildImage --publishImage -PdockerPublishRegistryPassword=<INSERT_GHCR_TOKEN>
```