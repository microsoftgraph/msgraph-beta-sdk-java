package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ComplianceIssue extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ComplianceIssue} and sets the default values.
     */
    public ComplianceIssue() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ComplianceIssue}
     */
    @jakarta.annotation.Nonnull
    public static ComplianceIssue createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.identityGovernance.attestationComplianceIssue": return new AttestationComplianceIssue();
            }
        }
        return new ComplianceIssue();
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("governingPolicyReferenceId", (n) -> { this.setGoverningPolicyReferenceId(n.getStringValue()); });
        deserializerMap.put("issueCode", (n) -> { this.setIssueCode(n.getStringValue()); });
        deserializerMap.put("ruleType", (n) -> { this.setRuleType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the governingPolicyReferenceId property value. The governingPolicyReferenceId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGoverningPolicyReferenceId() {
        return this.backingStore.get("governingPolicyReferenceId");
    }
    /**
     * Gets the issueCode property value. The issueCode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIssueCode() {
        return this.backingStore.get("issueCode");
    }
    /**
     * Gets the ruleType property value. The ruleType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRuleType() {
        return this.backingStore.get("ruleType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("governingPolicyReferenceId", this.getGoverningPolicyReferenceId());
        writer.writeStringValue("issueCode", this.getIssueCode());
        writer.writeStringValue("ruleType", this.getRuleType());
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the governingPolicyReferenceId property value. The governingPolicyReferenceId property
     * @param value Value to set for the governingPolicyReferenceId property.
     */
    public void setGoverningPolicyReferenceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("governingPolicyReferenceId", value);
    }
    /**
     * Sets the issueCode property value. The issueCode property
     * @param value Value to set for the issueCode property.
     */
    public void setIssueCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("issueCode", value);
    }
    /**
     * Sets the ruleType property value. The ruleType property
     * @param value Value to set for the ruleType property.
     */
    public void setRuleType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ruleType", value);
    }
}
