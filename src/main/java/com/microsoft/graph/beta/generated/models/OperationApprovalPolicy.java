package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The OperationApprovalPolicy entity allows an administrator to configure which operations require admin approval and the set of admins who can perform that approval. Creating a policy enables the multiple admin approval service to catch requests which are targeted by the specific policy type defined.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OperationApprovalPolicy extends Entity implements Parsable {
    /**
     * Instantiates a new {@link OperationApprovalPolicy} and sets the default values.
     */
    public OperationApprovalPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OperationApprovalPolicy}
     */
    @jakarta.annotation.Nonnull
    public static OperationApprovalPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OperationApprovalPolicy();
    }
    /**
     * Gets the approverGroupIds property value. The Microsoft Entra ID (Azure AD) security group IDs for the approvers for the policy. This property is required when the policy is created, and is defined by the IT Admins to define the possible approvers for the policy.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getApproverGroupIds() {
        return this.backingStore.get("approverGroupIds");
    }
    /**
     * Gets the description property value. Indicates the description of the policy. Maximum length of the description is 1024 characters. This property is not required, but can be used by the IT Admin to describe the policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Indicates the display name of the policy. Maximum length of the display name is 128 characters. This property is required when the policy is created, and is defined by the IT Admins to identify the policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("approverGroupIds", (n) -> { this.setApproverGroupIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("policyPlatform", (n) -> { this.setPolicyPlatform(n.getEnumSetValue(OperationApprovalPolicyPlatform::forValue)); });
        deserializerMap.put("policySet", (n) -> { this.setPolicySet(n.getObjectValue(OperationApprovalPolicySet::createFromDiscriminatorValue)); });
        deserializerMap.put("policyType", (n) -> { this.setPolicyType(n.getEnumValue(OperationApprovalPolicyType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. Indicates the last DateTime that the policy was modified. The value cannot be modified and is automatically populated whenever values in the request are updated. For example, when the 'policyType' property changes from apps to scripts. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the policyPlatform property value. The set of available platforms for the OperationApprovalPolicy. Allows configuration of a policy to specific platform(s) for approval. If no specific platform is required or applicable, the platform is `notApplicable`.
     * @return a {@link EnumSet<OperationApprovalPolicyPlatform>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<OperationApprovalPolicyPlatform> getPolicyPlatform() {
        return this.backingStore.get("policyPlatform");
    }
    /**
     * Gets the policySet property value. Indicates areas of the Intune UX that could support MAA UX for the current logged in IT Admin. This property is required, and is defined by the IT Admins in order to correctly show the expected experience.
     * @return a {@link OperationApprovalPolicySet}
     */
    @jakarta.annotation.Nullable
    public OperationApprovalPolicySet getPolicySet() {
        return this.backingStore.get("policySet");
    }
    /**
     * Gets the policyType property value. The set of available policy types that can be configured for approval. The policy type must always be defined in an OperationApprovalRequest.
     * @return a {@link OperationApprovalPolicyType}
     */
    @jakarta.annotation.Nullable
    public OperationApprovalPolicyType getPolicyType() {
        return this.backingStore.get("policyType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("approverGroupIds", this.getApproverGroupIds());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumSetValue("policyPlatform", this.getPolicyPlatform());
        writer.writeObjectValue("policySet", this.getPolicySet());
        writer.writeEnumValue("policyType", this.getPolicyType());
    }
    /**
     * Sets the approverGroupIds property value. The Microsoft Entra ID (Azure AD) security group IDs for the approvers for the policy. This property is required when the policy is created, and is defined by the IT Admins to define the possible approvers for the policy.
     * @param value Value to set for the approverGroupIds property.
     */
    public void setApproverGroupIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("approverGroupIds", value);
    }
    /**
     * Sets the description property value. Indicates the description of the policy. Maximum length of the description is 1024 characters. This property is not required, but can be used by the IT Admin to describe the policy.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Indicates the display name of the policy. Maximum length of the display name is 128 characters. This property is required when the policy is created, and is defined by the IT Admins to identify the policy.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Indicates the last DateTime that the policy was modified. The value cannot be modified and is automatically populated whenever values in the request are updated. For example, when the 'policyType' property changes from apps to scripts. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only. This property is read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the policyPlatform property value. The set of available platforms for the OperationApprovalPolicy. Allows configuration of a policy to specific platform(s) for approval. If no specific platform is required or applicable, the platform is `notApplicable`.
     * @param value Value to set for the policyPlatform property.
     */
    public void setPolicyPlatform(@jakarta.annotation.Nullable final EnumSet<OperationApprovalPolicyPlatform> value) {
        this.backingStore.set("policyPlatform", value);
    }
    /**
     * Sets the policySet property value. Indicates areas of the Intune UX that could support MAA UX for the current logged in IT Admin. This property is required, and is defined by the IT Admins in order to correctly show the expected experience.
     * @param value Value to set for the policySet property.
     */
    public void setPolicySet(@jakarta.annotation.Nullable final OperationApprovalPolicySet value) {
        this.backingStore.set("policySet", value);
    }
    /**
     * Sets the policyType property value. The set of available policy types that can be configured for approval. The policy type must always be defined in an OperationApprovalRequest.
     * @param value Value to set for the policyType property.
     */
    public void setPolicyType(@jakarta.annotation.Nullable final OperationApprovalPolicyType value) {
        this.backingStore.set("policyType", value);
    }
}
