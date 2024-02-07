package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A class that represents a contained app of a MicrosoftStoreForBusinessApp.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftStoreForBusinessContainedApp extends MobileContainedApp implements Parsable {
    /**
     * Instantiates a new MicrosoftStoreForBusinessContainedApp and sets the default values.
     */
    public MicrosoftStoreForBusinessContainedApp() {
        super();
        this.setOdataType("#microsoft.graph.microsoftStoreForBusinessContainedApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MicrosoftStoreForBusinessContainedApp
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftStoreForBusinessContainedApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftStoreForBusinessContainedApp();
    }
    /**
     * Gets the appUserModelId property value. The app user model ID of the contained app of a MicrosoftStoreForBusinessApp.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppUserModelId() {
        return this.backingStore.get("appUserModelId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appUserModelId", (n) -> { this.setAppUserModelId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appUserModelId", this.getAppUserModelId());
    }
    /**
     * Sets the appUserModelId property value. The app user model ID of the contained app of a MicrosoftStoreForBusinessApp.
     * @param value Value to set for the appUserModelId property.
     */
    public void setAppUserModelId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appUserModelId", value);
    }
}
