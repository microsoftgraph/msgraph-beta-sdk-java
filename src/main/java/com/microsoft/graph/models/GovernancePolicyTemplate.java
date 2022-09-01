package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of approvalWorkflowProvider entities. */
public class GovernancePolicyTemplate extends Entity implements Parsable {
    /** The displayName property */
    private String _displayName;
    /** The policy property */
    private GovernancePolicy _policy;
    /** The settings property */
    private BusinessFlowSettings _settings;
    /**
     * Instantiates a new governancePolicyTemplate and sets the default values.
     * @return a void
     */
    public GovernancePolicyTemplate() {
        super();
        this.setOdataType("#microsoft.graph.governancePolicyTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a governancePolicyTemplate
     */
    @javax.annotation.Nonnull
    public static GovernancePolicyTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernancePolicyTemplate();
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GovernancePolicyTemplate currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("policy", (n) -> { currentObject.setPolicy(n.getObjectValue(GovernancePolicy::createFromDiscriminatorValue)); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getObjectValue(BusinessFlowSettings::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the policy property value. The policy property
     * @return a governancePolicy
     */
    @javax.annotation.Nullable
    public GovernancePolicy getPolicy() {
        return this._policy;
    }
    /**
     * Gets the settings property value. The settings property
     * @return a businessFlowSettings
     */
    @javax.annotation.Nullable
    public BusinessFlowSettings getSettings() {
        return this._settings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("policy", this.getPolicy());
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the policy property value. The policy property
     * @param value Value to set for the policy property.
     * @return a void
     */
    public void setPolicy(@javax.annotation.Nullable final GovernancePolicy value) {
        this._policy = value;
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     * @return a void
     */
    public void setSettings(@javax.annotation.Nullable final BusinessFlowSettings value) {
        this._settings = value;
    }
}
