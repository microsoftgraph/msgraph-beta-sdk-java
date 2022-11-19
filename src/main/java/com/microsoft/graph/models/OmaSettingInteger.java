package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OmaSettingInteger extends OmaSetting implements Parsable {
    /** By setting to true, the CSP (configuration service provider) specified in the OMA-URI will perform a get, instead of set */
    private Boolean _isReadOnly;
    /** Value. */
    private Integer _value;
    /**
     * Instantiates a new OmaSettingInteger and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OmaSettingInteger() {
        super();
        this.setOdataType("#microsoft.graph.omaSettingInteger");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OmaSettingInteger
     */
    @javax.annotation.Nonnull
    public static OmaSettingInteger createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OmaSettingInteger();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OmaSettingInteger currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isReadOnly", (n) -> { currentObject.setIsReadOnly(n.getBooleanValue()); });
        deserializerMap.put("value", (n) -> { currentObject.setValue(n.getIntegerValue()); });
        return deserializerMap
    }
    /**
     * Gets the isReadOnly property value. By setting to true, the CSP (configuration service provider) specified in the OMA-URI will perform a get, instead of set
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsReadOnly() {
        return this._isReadOnly;
    }
    /**
     * Gets the value property value. Value.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getValue() {
        return this._value;
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
        writer.writeBooleanValue("isReadOnly", this.getIsReadOnly());
        writer.writeIntegerValue("value", this.getValue());
    }
    /**
     * Sets the isReadOnly property value. By setting to true, the CSP (configuration service provider) specified in the OMA-URI will perform a get, instead of set
     * @param value Value to set for the isReadOnly property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsReadOnly(@javax.annotation.Nullable final Boolean value) {
        this._isReadOnly = value;
    }
    /**
     * Sets the value property value. Value.
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final Integer value) {
        this._value = value;
    }
}
