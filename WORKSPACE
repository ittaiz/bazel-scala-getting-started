rules_scala_version="d916599d38de29085e5ca9eae167716c4f150a02" # update this as needed

http_archive(
             name = "io_bazel_rules_scala",
             url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip"%rules_scala_version,
             type = "zip",
             strip_prefix= "rules_scala-%s" % rules_scala_version
             )

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()
load("@io_bazel_rules_scala//specs2:specs2_junit.bzl","specs2_junit_repositories")
specs2_junit_repositories()