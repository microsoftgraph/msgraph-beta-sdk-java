package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementSettingEnrollmentTypeConstraint extends DeviceManagementConstraint implements Parsable {
    /** List of enrollment types */
    private java.util.List<String> _enrollmentTypes;
    /**
     * Instantiates a new DeviceManagementSettingEnrollmentTypeConstraint and sets the default values.
     * @return a void
     */
    public DeviceManagementSettingEnrollmentTypeConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingEnrollmentTypeConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementSettingEnrollmentTypeConstraint
     */
    @javax.annotation.Nonnull
    public static DeviceManagementSettingEnrollmentTypeConstraint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingEnrollmentTypeConstraint();
    }
    /**
     * Gets the enrollmentTypes property value. List of enrollment types
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEnrollmentTypes() {
        return this._enrollmentTypes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementSettingEnrollmentTypeConstraint currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("enrollmentTypes", (n) -> { currentObject.setEnrollmentTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("enrollmentTypes", this.getEnrollmentTypes());
    }
    /**
     * Sets the enrollmentTypes property value. List of enrollment types
     * @param value Value to set for the enrollmentTypes property.
     * @return a void
     */
    public void setEnrollmentTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._enrollmentTypes = value;
    }
}
