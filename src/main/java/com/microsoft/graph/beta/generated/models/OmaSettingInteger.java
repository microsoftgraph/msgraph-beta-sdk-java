package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OMA Settings Integer definition.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OmaSettingInteger extends OmaSetting implements Parsable {
    /**
     * Instantiates a new {@link OmaSettingInteger} and sets the default values.
     */
    public OmaSettingInteger() {
        super();
        this.setOdataType("#microsoft.graph.omaSettingInteger");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OmaSettingInteger}
     */
    @jakarta.annotation.Nonnull
    public static OmaSettingInteger createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OmaSettingInteger();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isReadOnly", (n) -> { this.setIsReadOnly(n.getBooleanValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isReadOnly property value. By setting to true, the CSP (configuration service provider) specified in the OMA-URI will perform a get, instead of set
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReadOnly() {
        return this.backingStore.get("isReadOnly");
    }
    /**
     * Gets the value property value. Value.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isReadOnly", this.getIsReadOnly());
        writer.writeIntegerValue("value", this.getValue());
    }
    /**
     * Sets the isReadOnly property value. By setting to true, the CSP (configuration service provider) specified in the OMA-URI will perform a get, instead of set
     * @param value Value to set for the isReadOnly property.
     */
    public void setIsReadOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isReadOnly", value);
    }
    /**
     * Sets the value property value. Value.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("value", value);
    }
}
