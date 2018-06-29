workspace(name = "deadline_semantics")

http_archive(
    name = "io_grpc_grpc_java",
    strip_prefix = "grpc-java-1.13.1",
    urls = ["https://github.com/grpc/grpc-java/archive/v1.13.1.zip"],
)

load("@io_grpc_grpc_java//:repositories.bzl", "grpc_java_repositories")

grpc_java_repositories()
