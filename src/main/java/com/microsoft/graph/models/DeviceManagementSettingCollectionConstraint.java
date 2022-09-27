package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementSettingCollectionConstraint extends DeviceManagementConstraint implements Parsable {
    /** The maximum number of elements in the collection */
    private Integer _maximumLength;
    /** The minimum number of elements in the collection */
    private Integer _minimumLength;
    /**
     * Instantiates a new DeviceManagementSettingCollectionConstraint and sets the default values.
     * @return a void
     */
    public DeviceManagementSettingCollectionConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingCollectionConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementSettingCollectionConstraint
     */
    @javax.annotation.Nonnull
    public static DeviceManagementSettingCollectionConstraint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingCollectionConstraint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementSettingCollectionConstraint currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("maximumLength", (n) -> { currentObject.setMaximumLength(n.getIntegerValue()); });
            this.put("minimumLength", (n) -> { currentObject.setMinimumLength(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the maximumLength property value. The maximum number of elements in the collection
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumLength() {
        return this._maximumLength;
    }
    /**
     * Gets the minimumLength property value. The minimum number of elements in the collection
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumLength() {
        return this._minimumLength;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("maximumLength", this.getMaximumLength());
        writer.writeIntegerValue("minimumLength", this.getMinimumLength());
    }
    /**
     * Sets the maximumLength property value. The maximum number of elements in the collection
     * @param value Value to set for the maximumLength property.
     * @return a void
     */
    public void setMaximumLength(@javax.annotation.Nullable final Integer value) {
        this._maximumLength = value;
    }
    /**
     * Sets the minimumLength property value. The minimum number of elements in the collection
     * @param value Value to set for the minimumLength property.
     * @return a void
     */
    public void setMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._minimumLength = value;
    }
}
