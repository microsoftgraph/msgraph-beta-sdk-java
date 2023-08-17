package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MatchingDlpRule implements AdditionalDataHolder, Parsable {
    /**
     * The actions property
     */
    private java.util.List<DlpActionInfo> actions;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The isMostRestrictive property
     */
    private Boolean isMostRestrictive;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The policyId property
     */
    private String policyId;
    /**
     * The policyName property
     */
    private String policyName;
    /**
     * The priority property
     */
    private Integer priority;
    /**
     * The ruleId property
     */
    private String ruleId;
    /**
     * The ruleMode property
     */
    private RuleMode ruleMode;
    /**
     * The ruleName property
     */
    private String ruleName;
    /**
     * Instantiates a new matchingDlpRule and sets the default values.
     */
    public MatchingDlpRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a matchingDlpRule
     */
    @jakarta.annotation.Nonnull
    public static MatchingDlpRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MatchingDlpRule();
    }
    /**
     * Gets the actions property value. The actions property
     * @return a dlpActionInfo
     */
    @jakarta.annotation.Nullable
    public java.util.List<DlpActionInfo> getActions() {
        return this.actions;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("actions", (n) -> { this.setActions(n.getCollectionOfObjectValues(DlpActionInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("isMostRestrictive", (n) -> { this.setIsMostRestrictive(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("policyName", (n) -> { this.setPolicyName(n.getStringValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("ruleId", (n) -> { this.setRuleId(n.getStringValue()); });
        deserializerMap.put("ruleMode", (n) -> { this.setRuleMode(n.getEnumValue(RuleMode.class)); });
        deserializerMap.put("ruleName", (n) -> { this.setRuleName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isMostRestrictive property value. The isMostRestrictive property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMostRestrictive() {
        return this.isMostRestrictive;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the policyId property value. The policyId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.policyId;
    }
    /**
     * Gets the policyName property value. The policyName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPolicyName() {
        return this.policyName;
    }
    /**
     * Gets the priority property value. The priority property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Gets the ruleId property value. The ruleId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRuleId() {
        return this.ruleId;
    }
    /**
     * Gets the ruleMode property value. The ruleMode property
     * @return a ruleMode
     */
    @jakarta.annotation.Nullable
    public RuleMode getRuleMode() {
        return this.ruleMode;
    }
    /**
     * Gets the ruleName property value. The ruleName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRuleName() {
        return this.ruleName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("actions", this.getActions());
        writer.writeBooleanValue("isMostRestrictive", this.getIsMostRestrictive());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeStringValue("policyName", this.getPolicyName());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeStringValue("ruleId", this.getRuleId());
        writer.writeEnumValue("ruleMode", this.getRuleMode());
        writer.writeStringValue("ruleName", this.getRuleName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actions property value. The actions property
     * @param value Value to set for the actions property.
     */
    public void setActions(@jakarta.annotation.Nullable final java.util.List<DlpActionInfo> value) {
        this.actions = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the isMostRestrictive property value. The isMostRestrictive property
     * @param value Value to set for the isMostRestrictive property.
     */
    public void setIsMostRestrictive(@jakarta.annotation.Nullable final Boolean value) {
        this.isMostRestrictive = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the policyId property value. The policyId property
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.policyId = value;
    }
    /**
     * Sets the policyName property value. The policyName property
     * @param value Value to set for the policyName property.
     */
    public void setPolicyName(@jakarta.annotation.Nullable final String value) {
        this.policyName = value;
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.priority = value;
    }
    /**
     * Sets the ruleId property value. The ruleId property
     * @param value Value to set for the ruleId property.
     */
    public void setRuleId(@jakarta.annotation.Nullable final String value) {
        this.ruleId = value;
    }
    /**
     * Sets the ruleMode property value. The ruleMode property
     * @param value Value to set for the ruleMode property.
     */
    public void setRuleMode(@jakarta.annotation.Nullable final RuleMode value) {
        this.ruleMode = value;
    }
    /**
     * Sets the ruleName property value. The ruleName property
     * @param value Value to set for the ruleName property.
     */
    public void setRuleName(@jakarta.annotation.Nullable final String value) {
        this.ruleName = value;
    }
}
