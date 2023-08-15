package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Constraint that enforces the enrollment types applied to a setting
 */
public class DeviceManagementSettingEnrollmentTypeConstraint extends DeviceManagementConstraint implements Parsable {
    /**
     * List of enrollment types
     */
    private java.util.List<String> enrollmentTypes;
    /**
     * Instantiates a new deviceManagementSettingEnrollmentTypeConstraint and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementSettingEnrollmentTypeConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingEnrollmentTypeConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementSettingEnrollmentTypeConstraint
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettingEnrollmentTypeConstraint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingEnrollmentTypeConstraint();
    }
    /**
     * Gets the enrollmentTypes property value. List of enrollment types
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEnrollmentTypes() {
        return this.enrollmentTypes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enrollmentTypes", (n) -> { this.setEnrollmentTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("enrollmentTypes", this.getEnrollmentTypes());
    }
    /**
     * Sets the enrollmentTypes property value. List of enrollment types
     * @param value Value to set for the enrollmentTypes property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEnrollmentTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.enrollmentTypes = value;
    }
}
