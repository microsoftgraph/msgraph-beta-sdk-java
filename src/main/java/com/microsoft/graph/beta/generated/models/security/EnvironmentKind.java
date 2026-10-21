package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The kind of cloud environment onboarded to security posture management.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnvironmentKind implements ValuedEnum {
    /** An Azure subscription. */
    AzureSubscription("azureSubscription"),
    /** An AWS organization. */
    AwsOrganization("awsOrganization"),
    /** An AWS account. */
    AwsAccount("awsAccount"),
    /** A GCP organization. */
    GcpOrganization("gcpOrganization"),
    /** A GCP project. */
    GcpProject("gcpProject"),
    /** A Docker Hub organization. */
    DockersHubOrganization("dockersHubOrganization"),
    /** A DevOps connection. */
    DevOpsConnection("devOpsConnection"),
    /** An Azure DevOps organization. */
    AzureDevOpsOrganization("azureDevOpsOrganization"),
    /** A GitHub organization. */
    GitHubOrganization("gitHubOrganization"),
    /** A GitLab group. */
    GitLabGroup("gitLabGroup"),
    /** A JFrog Artifactory instance. */
    JFrogArtifactory("jFrogArtifactory"),
    /** A marker value for members added after the release of this API. */
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
