package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AzureAdTokenAuthentication extends CustomExtensionAuthenticationConfiguration implements Parsable {
    /**
     * Instantiates a new {@link AzureAdTokenAuthentication} and sets the default values.
     */
    public AzureAdTokenAuthentication() {
        super();
        this.setOdataType("#microsoft.graph.azureAdTokenAuthentication");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AzureAdTokenAuthentication}
     */
    @jakarta.annotation.Nonnull
    public static AzureAdTokenAuthentication createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureAdTokenAuthentication();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the resourceId property value. The app ID or identifier URI of the Microsoft Entra application used to authenticate calls to the external app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.backingStore.get("resourceId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("resourceId", this.getResourceId());
    }
    /**
     * Sets the resourceId property value. The app ID or identifier URI of the Microsoft Entra application used to authenticate calls to the external app.
     * @param value Value to set for the resourceId property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceId", value);
    }
}
