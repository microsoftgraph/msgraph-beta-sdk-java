package com.microsoft.graph.beta.models.partner.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecurityRequirement extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SecurityRequirement} and sets the default values.
     */
    public SecurityRequirement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SecurityRequirement}
     */
    @jakarta.annotation.Nonnull
    public static SecurityRequirement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.partner.security.adminsMfaEnforcedSecurityRequirement": return new AdminsMfaEnforcedSecurityRequirement();
                case "#microsoft.graph.partner.security.customersMfaEnforcedSecurityRequirement": return new CustomersMfaEnforcedSecurityRequirement();
                case "#microsoft.graph.partner.security.customersSpendingBudgetSecurityRequirement": return new CustomersSpendingBudgetSecurityRequirement();
                case "#microsoft.graph.partner.security.responseTimeSecurityRequirement": return new ResponseTimeSecurityRequirement();
            }
        }
        return new SecurityRequirement();
    }
    /**
     * Gets the actionUrl property value. The link to the site where the admin can take action on the requirement.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionUrl() {
        return this.backingStore.get("actionUrl");
    }
    /**
     * Gets the complianceStatus property value. The complianceStatus property
     * @return a {@link ComplianceStatus}
     */
    @jakarta.annotation.Nullable
    public ComplianceStatus getComplianceStatus() {
        return this.backingStore.get("complianceStatus");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionUrl", (n) -> { this.setActionUrl(n.getStringValue()); });
        deserializerMap.put("complianceStatus", (n) -> { this.setComplianceStatus(n.getEnumValue(ComplianceStatus::forValue)); });
        deserializerMap.put("helpUrl", (n) -> { this.setHelpUrl(n.getStringValue()); });
        deserializerMap.put("maxScore", (n) -> { this.setMaxScore(n.getLongValue()); });
        deserializerMap.put("requirementType", (n) -> { this.setRequirementType(n.getEnumValue(SecurityRequirementType::forValue)); });
        deserializerMap.put("score", (n) -> { this.setScore(n.getLongValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(SecurityRequirementState::forValue)); });
        deserializerMap.put("updatedDateTime", (n) -> { this.setUpdatedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the helpUrl property value. The link to documentation for the requirement.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHelpUrl() {
        return this.backingStore.get("helpUrl");
    }
    /**
     * Gets the maxScore property value. The maximum score possible for the requirement.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMaxScore() {
        return this.backingStore.get("maxScore");
    }
    /**
     * Gets the requirementType property value. The requirementType property
     * @return a {@link SecurityRequirementType}
     */
    @jakarta.annotation.Nullable
    public SecurityRequirementType getRequirementType() {
        return this.backingStore.get("requirementType");
    }
    /**
     * Gets the score property value. The score received for this requirement.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getScore() {
        return this.backingStore.get("score");
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link SecurityRequirementState}
     */
    @jakarta.annotation.Nullable
    public SecurityRequirementState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the updatedDateTime property value. The date the requirement properties were last updated.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedDateTime() {
        return this.backingStore.get("updatedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("actionUrl", this.getActionUrl());
        writer.writeEnumValue("complianceStatus", this.getComplianceStatus());
        writer.writeStringValue("helpUrl", this.getHelpUrl());
        writer.writeLongValue("maxScore", this.getMaxScore());
        writer.writeEnumValue("requirementType", this.getRequirementType());
        writer.writeLongValue("score", this.getScore());
        writer.writeEnumValue("state", this.getState());
        writer.writeOffsetDateTimeValue("updatedDateTime", this.getUpdatedDateTime());
    }
    /**
     * Sets the actionUrl property value. The link to the site where the admin can take action on the requirement.
     * @param value Value to set for the actionUrl property.
     */
    public void setActionUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("actionUrl", value);
    }
    /**
     * Sets the complianceStatus property value. The complianceStatus property
     * @param value Value to set for the complianceStatus property.
     */
    public void setComplianceStatus(@jakarta.annotation.Nullable final ComplianceStatus value) {
        this.backingStore.set("complianceStatus", value);
    }
    /**
     * Sets the helpUrl property value. The link to documentation for the requirement.
     * @param value Value to set for the helpUrl property.
     */
    public void setHelpUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("helpUrl", value);
    }
    /**
     * Sets the maxScore property value. The maximum score possible for the requirement.
     * @param value Value to set for the maxScore property.
     */
    public void setMaxScore(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("maxScore", value);
    }
    /**
     * Sets the requirementType property value. The requirementType property
     * @param value Value to set for the requirementType property.
     */
    public void setRequirementType(@jakarta.annotation.Nullable final SecurityRequirementType value) {
        this.backingStore.set("requirementType", value);
    }
    /**
     * Sets the score property value. The score received for this requirement.
     * @param value Value to set for the score property.
     */
    public void setScore(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("score", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final SecurityRequirementState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the updatedDateTime property value. The date the requirement properties were last updated.
     * @param value Value to set for the updatedDateTime property.
     */
    public void setUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("updatedDateTime", value);
    }
}
