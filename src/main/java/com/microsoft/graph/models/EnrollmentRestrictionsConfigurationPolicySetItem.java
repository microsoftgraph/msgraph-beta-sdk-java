package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A class containing the properties used for enrollment restriction PolicySetItem.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EnrollmentRestrictionsConfigurationPolicySetItem extends PolicySetItem implements Parsable {
    /**
     * Instantiates a new EnrollmentRestrictionsConfigurationPolicySetItem and sets the default values.
     */
    public EnrollmentRestrictionsConfigurationPolicySetItem() {
        super();
        this.setOdataType("#microsoft.graph.enrollmentRestrictionsConfigurationPolicySetItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EnrollmentRestrictionsConfigurationPolicySetItem
     */
    @jakarta.annotation.Nonnull
    public static EnrollmentRestrictionsConfigurationPolicySetItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnrollmentRestrictionsConfigurationPolicySetItem();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the limit property value. Limit of the EnrollmentRestrictionsConfigurationPolicySetItem.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.BackingStore.get("limit");
    }
    /**
     * Gets the priority property value. Priority of the EnrollmentRestrictionsConfigurationPolicySetItem.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.BackingStore.get("priority");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeIntegerValue("priority", this.getPriority());
    }
    /**
     * Sets the limit property value. Limit of the EnrollmentRestrictionsConfigurationPolicySetItem.
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("limit", value);
    }
    /**
     * Sets the priority property value. Priority of the EnrollmentRestrictionsConfigurationPolicySetItem.
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("priority", value);
    }
}
