# opentelemetry-quickstart

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Deploy OpenTelemetry Collector

Configuration for dynatrace and jaeger will be deployed.

```
oc new-project my-app
oc apply -f OpenTelemetryCollector-dynatrace-jaeger.yaml
```
