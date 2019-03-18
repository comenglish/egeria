#!/bin/bash
# SPDX-License-Identifier: Apache-2.0
# Copyright Contributors to the Egeria project.

token="$(cat /var/run/secrets/kubernetes.io/serviceaccount/token)"
available_pods=$(curl -s --cacert $CACERT --header "Authorization: Bearer $token" https://kubernetes.default.svc/api/v1/namespaces/$NAMESPACE/endpoints/$SERVICE | jq -r '.subsets[].addresses | length')

until [ $available_pods -ge 1 ]; do
    echo waiting for $SERVICE
    sleep 2
    available_pods=$(curl -s --cacert $CACERT --header "Authorization: Bearer $token" https://kubernetes.default.svc/api/v1/namespaces/$NAMESPACE/endpoints/$SERVICE | jq -r '.subsets[].addresses | length')
done