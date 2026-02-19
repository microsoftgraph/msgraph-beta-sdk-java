package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QualityUpdateRing extends Ring implements Parsable {
    /**
     * Instantiates a new {@link QualityUpdateRing} and sets the default values.
     */
    public QualityUpdateRing() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.qualityUpdateRing");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link QualityUpdateRing}
     */
    @jakarta.annotation.Nonnull
    public static QualityUpdateRing createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QualityUpdateRing();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isHotpatchEnabled", (n) -> { this.setIsHotpatchEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isHotpatchEnabled property value. Identifies whether a hotpatch update is available.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHotpatchEnabled() {
        return this.backingStore.get("isHotpatchEnabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isHotpatchEnabled", this.getIsHotpatchEnabled());
    }
    /**
     * Sets the isHotpatchEnabled property value. Identifies whether a hotpatch update is available.
     * @param value Value to set for the isHotpatchEnabled property.
     */
    public void setIsHotpatchEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isHotpatchEnabled", value);
    }
}
