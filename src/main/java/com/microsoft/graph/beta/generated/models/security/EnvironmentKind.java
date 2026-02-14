package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnvironmentKind implements ValuedEnum {
    AzureSubscription("azureSubscription"),
    AwsOrganization("awsOrganization"),
    AwsAccount("awsAccount"),
    GcpOrganization("gcpOrganization"),
    GcpProject("gcpProject"),
    DockersHubOrganization("dockersHubOrganization"),
    DevOpsConnection("devOpsConnection"),
    AzureDevOpsOrganization("azureDevOpsOrganization"),
    GitHubOrganization("gitHubOrganization"),
    GitLabGroup("gitLabGroup"),
    JFrogArtifactory("jFrogArtifactory"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EnvironmentKind(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnvironmentKind forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "azureSubscription": return AzureSubscription;
            case "awsOrganization": return AwsOrganization;
            case "awsAccount": return AwsAccount;
            case "gcpOrganization": return GcpOrganization;
            case "gcpProject": return GcpProject;
            case "dockersHubOrganization": return DockersHubOrganization;
            case "devOpsConnection": return DevOpsConnection;
            case "azureDevOpsOrganization": return AzureDevOpsOrganization;
            case "gitHubOrganization": return GitHubOrganization;
            case "gitLabGroup": return GitLabGroup;
            case "jFrogArtifactory": return JFrogArtifactory;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
