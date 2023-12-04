package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Show the home button; clicking the home button loads a specific URL.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdgeHomeButtonOpensCustomURL extends EdgeHomeButtonConfiguration implements Parsable {
    /**
     * Instantiates a new EdgeHomeButtonOpensCustomURL and sets the default values.
     */
    public EdgeHomeButtonOpensCustomURL() {
        super();
        this.setOdataType("#microsoft.graph.edgeHomeButtonOpensCustomURL");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EdgeHomeButtonOpensCustomURL
     */
    @jakarta.annotation.Nonnull
    public static EdgeHomeButtonOpensCustomURL createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdgeHomeButtonOpensCustomURL();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("homeButtonCustomURL", (n) -> { this.setHomeButtonCustomURL(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the homeButtonCustomURL property value. The specific URL to load.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHomeButtonCustomURL() {
        return this.backingStore.get("homeButtonCustomURL");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("homeButtonCustomURL", this.getHomeButtonCustomURL());
    }
    /**
     * Sets the homeButtonCustomURL property value. The specific URL to load.
     * @param value Value to set for the homeButtonCustomURL property.
     */
    public void setHomeButtonCustomURL(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("homeButtonCustomURL", value);
    }
}
