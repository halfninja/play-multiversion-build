# Building a project for multiple versions of Play and Scala

Normally cross-building Scala versions is no problem because SBT has built-in support, and you can modify any regular dependency versions based on `scalaVersion`. However it becomes more complicated when you need to modify versions of plugins, because those are part of the build project, ergo you need to run separate builds.

The solution in this project is simply to symlink the common application code into separate projects with their own build definitions. I'd be happy to hear of any neater ways to do this.

I did try aggregating these projects in a top level build, but it appears not to use the inner plugins, so I think they do need to be run as isolated builds.

## Usage

Go into each of the `play2*` directories and cross-run tasks from there, e.g. `sbt "+test"` or `sbt +"runMain Code"` (there isn't much actual source code as I'm only really testing the build).

## Workarounds

There is a setting in the Play 2.7 project to disable "omnidoc", simply because there isn't a Scala 2.13 build of it yet. That can be re-enabled once everything has a 2.13 release.
