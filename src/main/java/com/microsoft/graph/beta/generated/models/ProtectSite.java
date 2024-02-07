package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProtectSite extends LabelActionBase implements Parsable {
    /**
     * Instantiates a new ProtectSite and sets the default values.
     */
    public ProtectSite() {
        super();
        this.setOdataType("#microsoft.graph.protectSite");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProtectSite
     */
    @jakarta.annotation.Nonnull
    public static ProtectSite createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProtectSite();
    }
    /**
     * Gets the accessType property value. The accessType property
     * @return a SiteAccessType
     */
    @jakarta.annotation.Nullable
    public SiteAccessType getAccessType() {
        return this.backingStore.get("accessType");
    }
    /**
     * Gets the conditionalAccessProtectionLevelId property value. The conditionalAccessProtectionLevelId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConditionalAccessProtectionLevelId() {
        return this.backingStore.get("conditionalAccessProtectionLevelId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessType", (n) -> { this.setAccessType(n.getEnumValue(SiteAccessType::forValue)); });
        deserializerMap.put("conditionalAccessProtectionLevelId", (n) -> { this.setConditionalAccessProtectionLevelId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("accessType", this.getAccessType());
        writer.writeStringValue("conditionalAccessProtectionLevelId", this.getConditionalAccessProtectionLevelId());
    }
    /**
     * Sets the accessType property value. The accessType property
     * @param value Value to set for the accessType property.
     */
    public void setAccessType(@jakarta.annotation.Nullable final SiteAccessType value) {
        this.backingStore.set("accessType", value);
    }
    /**
     * Sets the conditionalAccessProtectionLevelId property value. The conditionalAccessProtectionLevelId property
     * @param value Value to set for the conditionalAccessProtectionLevelId property.
     */
    public void setConditionalAccessProtectionLevelId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("conditionalAccessProtectionLevelId", value);
    }
}
