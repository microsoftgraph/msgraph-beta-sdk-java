package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SecurityBaselineTemplate extends DeviceManagementTemplate implements Parsable {
    /** The security baseline per category device state summary */
    private java.util.List<SecurityBaselineCategoryStateSummary> _categoryDeviceStateSummaries;
    /** The security baseline device states */
    private java.util.List<SecurityBaselineDeviceState> _deviceStates;
    /** The security baseline device state summary */
    private SecurityBaselineStateSummary _deviceStateSummary;
    /**
     * Instantiates a new SecurityBaselineTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SecurityBaselineTemplate() {
        super();
        this.setOdataType("#microsoft.graph.securityBaselineTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SecurityBaselineTemplate
     */
    @javax.annotation.Nonnull
    public static SecurityBaselineTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityBaselineTemplate();
    }
    /**
     * Gets the categoryDeviceStateSummaries property value. The security baseline per category device state summary
     * @return a securityBaselineCategoryStateSummary
     */
    @javax.annotation.Nullable
    public java.util.List<SecurityBaselineCategoryStateSummary> getCategoryDeviceStateSummaries() {
        return this._categoryDeviceStateSummaries;
    }
    /**
     * Gets the deviceStates property value. The security baseline device states
     * @return a securityBaselineDeviceState
     */
    @javax.annotation.Nullable
    public java.util.List<SecurityBaselineDeviceState> getDeviceStates() {
        return this._deviceStates;
    }
    /**
     * Gets the deviceStateSummary property value. The security baseline device state summary
     * @return a securityBaselineStateSummary
     */
    @javax.annotation.Nullable
    public SecurityBaselineStateSummary getDeviceStateSummary() {
        return this._deviceStateSummary;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SecurityBaselineTemplate currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("categoryDeviceStateSummaries", (n) -> { currentObject.setCategoryDeviceStateSummaries(n.getCollectionOfObjectValues(SecurityBaselineCategoryStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceStates", (n) -> { currentObject.setDeviceStates(n.getCollectionOfObjectValues(SecurityBaselineDeviceState::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceStateSummary", (n) -> { currentObject.setDeviceStateSummary(n.getObjectValue(SecurityBaselineStateSummary::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("categoryDeviceStateSummaries", this.getCategoryDeviceStateSummaries());
        writer.writeCollectionOfObjectValues("deviceStates", this.getDeviceStates());
        writer.writeObjectValue("deviceStateSummary", this.getDeviceStateSummary());
    }
    /**
     * Sets the categoryDeviceStateSummaries property value. The security baseline per category device state summary
     * @param value Value to set for the categoryDeviceStateSummaries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategoryDeviceStateSummaries(@javax.annotation.Nullable final java.util.List<SecurityBaselineCategoryStateSummary> value) {
        this._categoryDeviceStateSummaries = value;
    }
    /**
     * Sets the deviceStates property value. The security baseline device states
     * @param value Value to set for the deviceStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceStates(@javax.annotation.Nullable final java.util.List<SecurityBaselineDeviceState> value) {
        this._deviceStates = value;
    }
    /**
     * Sets the deviceStateSummary property value. The security baseline device state summary
     * @param value Value to set for the deviceStateSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceStateSummary(@javax.annotation.Nullable final SecurityBaselineStateSummary value) {
        this._deviceStateSummary = value;
    }
}
