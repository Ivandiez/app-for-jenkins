job = Jenkins.instance.getItemByFullName("Deploy-to-Prod")
job.builds.each() { build ->
  build.delete()
}

job.updateNextBuildNumber(1)
