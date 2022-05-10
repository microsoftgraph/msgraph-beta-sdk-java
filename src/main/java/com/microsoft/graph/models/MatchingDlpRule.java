package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MatchingDlpRule implements AdditionalDataHolder, Parsable {
    /** The actions property */
    private java.util.List<DlpActionInfo> _actions;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The isMostRestrictive property */
    private Boolean _isMostRestrictive;
    /** The policyId property */
    private String _policyId;
    /** The policyName property */
    private String _policyName;
    /** The priority property */
    private Integer _priority;
    /** The ruleId property */
    private String _ruleId;
    /** The ruleMode property */
    private RuleMode _ruleMode;
    /** The ruleName property */
    private String _ruleName;
    /**
     * Instantiates a new matchingDlpRule and sets the default values.
     * @return a void
     */
    public MatchingDlpRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a matchingDlpRule
     */
    @javax.annotation.Nonnull
    public static MatchingDlpRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MatchingDlpRule();
    }
    /**
     * Gets the actions property value. The actions property
     * @return a dlpActionInfo
     */
    @javax.annotation.Nullable
    public java.util.List<DlpActionInfo> getActions() {
        return this._actions;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MatchingDlpRule currentObject = this;
        return new HashMap<>(8) {{
            this.put("actions", (n) -> { currentObject.setActions(n.getCollectionOfObjectValues(DlpActionInfo::createFromDiscriminatorValue)); });
            this.put("isMostRestrictive", (n) -> { currentObject.setIsMostRestrictive(n.getBooleanValue()); });
            this.put("policyId", (n) -> { currentObject.setPolicyId(n.getStringValue()); });
            this.put("policyName", (n) -> { currentObject.setPolicyName(n.getStringValue()); });
            this.put("priority", (n) -> { currentObject.setPriority(n.getIntegerValue()); });
            this.put("ruleId", (n) -> { currentObject.setRuleId(n.getStringValue()); });
            this.put("ruleMode", (n) -> { currentObject.setRuleMode(n.getEnumValue(RuleMode.class)); });
            this.put("ruleName", (n) -> { currentObject.setRuleName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isMostRestrictive property value. The isMostRestrictive property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMostRestrictive() {
        return this._isMostRestrictive;
    }
    /**
     * Gets the policyId property value. The policyId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyId() {
        return this._policyId;
    }
    /**
     * Gets the policyName property value. The policyName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyName() {
        return this._policyName;
    }
    /**
     * Gets the priority property value. The priority property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this._priority;
    }
    /**
     * Gets the ruleId property value. The ruleId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRuleId() {
        return this._ruleId;
    }
    /**
     * Gets the ruleMode property value. The ruleMode property
     * @return a ruleMode
     */
    @javax.annotation.Nullable
    public RuleMode getRuleMode() {
        return this._ruleMode;
    }
    /**
     * Gets the ruleName property value. The ruleName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRuleName() {
        return this._ruleName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("actions", this.getActions());
        writer.writeBooleanValue("isMostRestrictive", this.getIsMostRestrictive());
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
     * @return a void
     */
    public void setActions(@javax.annotation.Nullable final java.util.List<DlpActionInfo> value) {
        this._actions = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the isMostRestrictive property value. The isMostRestrictive property
     * @param value Value to set for the isMostRestrictive property.
     * @return a void
     */
    public void setIsMostRestrictive(@javax.annotation.Nullable final Boolean value) {
        this._isMostRestrictive = value;
    }
    /**
     * Sets the policyId property value. The policyId property
     * @param value Value to set for the policyId property.
     * @return a void
     */
    public void setPolicyId(@javax.annotation.Nullable final String value) {
        this._policyId = value;
    }
    /**
     * Sets the policyName property value. The policyName property
     * @param value Value to set for the policyName property.
     * @return a void
     */
    public void setPolicyName(@javax.annotation.Nullable final String value) {
        this._policyName = value;
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     * @return a void
     */
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this._priority = value;
    }
    /**
     * Sets the ruleId property value. The ruleId property
     * @param value Value to set for the ruleId property.
     * @return a void
     */
    public void setRuleId(@javax.annotation.Nullable final String value) {
        this._ruleId = value;
    }
    /**
     * Sets the ruleMode property value. The ruleMode property
     * @param value Value to set for the ruleMode property.
     * @return a void
     */
    public void setRuleMode(@javax.annotation.Nullable final RuleMode value) {
        this._ruleMode = value;
    }
    /**
     * Sets the ruleName property value. The ruleName property
     * @param value Value to set for the ruleName property.
     * @return a void
     */
    public void setRuleName(@javax.annotation.Nullable final String value) {
        this._ruleName = value;
    }
}
