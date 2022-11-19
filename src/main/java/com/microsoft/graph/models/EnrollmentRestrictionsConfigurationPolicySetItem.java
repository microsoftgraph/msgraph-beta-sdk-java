package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EnrollmentRestrictionsConfigurationPolicySetItem extends PolicySetItem implements Parsable {
    /** Limit of the EnrollmentRestrictionsConfigurationPolicySetItem. */
    private Integer _limit;
    /** Priority of the EnrollmentRestrictionsConfigurationPolicySetItem. */
    private Integer _priority;
    /**
     * Instantiates a new EnrollmentRestrictionsConfigurationPolicySetItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EnrollmentRestrictionsConfigurationPolicySetItem() {
        super();
        this.setOdataType("#microsoft.graph.enrollmentRestrictionsConfigurationPolicySetItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EnrollmentRestrictionsConfigurationPolicySetItem
     */
    @javax.annotation.Nonnull
    public static EnrollmentRestrictionsConfigurationPolicySetItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnrollmentRestrictionsConfigurationPolicySetItem();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EnrollmentRestrictionsConfigurationPolicySetItem currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("limit", (n) -> { currentObject.setLimit(n.getIntegerValue()); });
        deserializerMap.put("priority", (n) -> { currentObject.setPriority(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the limit property value. Limit of the EnrollmentRestrictionsConfigurationPolicySetItem.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLimit() {
        return this._limit;
    }
    /**
     * Gets the priority property value. Priority of the EnrollmentRestrictionsConfigurationPolicySetItem.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this._priority;
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
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeIntegerValue("priority", this.getPriority());
    }
    /**
     * Sets the limit property value. Limit of the EnrollmentRestrictionsConfigurationPolicySetItem.
     * @param value Value to set for the limit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLimit(@javax.annotation.Nullable final Integer value) {
        this._limit = value;
    }
    /**
     * Sets the priority property value. Priority of the EnrollmentRestrictionsConfigurationPolicySetItem.
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this._priority = value;
    }
}
