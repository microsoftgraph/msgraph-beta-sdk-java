package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CorsConfigurationV2 extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CorsConfigurationV2} and sets the default values.
     */
    public CorsConfigurationV2() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CorsConfigurationV2}
     */
    @jakarta.annotation.Nonnull
    public static CorsConfigurationV2 createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CorsConfigurationV2();
    }
    /**
     * Gets the allowedHeaders property value. The request headers that the origin domain may specify on the CORS request. The wildcard character * indicates that any header beginning with the specified prefix is allowed.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedHeaders() {
        return this.backingStore.get("allowedHeaders");
    }
    /**
     * Gets the allowedMethods property value. The HTTP request methods that the origin domain may use for a CORS request.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedMethods() {
        return this.backingStore.get("allowedMethods");
    }
    /**
     * Gets the allowedOrigins property value. The origin domains that are permitted to make a request against the service via CORS. The origin domain is the domain from which the request originates. The origin must be an exact case-sensitive match with the origin that the user agent sends to the service.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedOrigins() {
        return this.backingStore.get("allowedOrigins");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedHeaders", (n) -> { this.setAllowedHeaders(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("allowedMethods", (n) -> { this.setAllowedMethods(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("allowedOrigins", (n) -> { this.setAllowedOrigins(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("maxAgeInSeconds", (n) -> { this.setMaxAgeInSeconds(n.getIntegerValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxAgeInSeconds property value. The maximum amount of time that a browser should cache the response to the preflight OPTIONS request.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxAgeInSeconds() {
        return this.backingStore.get("maxAgeInSeconds");
    }
    /**
     * Gets the resource property value. Resource within the application segment for which CORS permissions are granted. / grants permission for the whole app segment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResource() {
        return this.backingStore.get("resource");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("allowedHeaders", this.getAllowedHeaders());
        writer.writeCollectionOfPrimitiveValues("allowedMethods", this.getAllowedMethods());
        writer.writeCollectionOfPrimitiveValues("allowedOrigins", this.getAllowedOrigins());
        writer.writeIntegerValue("maxAgeInSeconds", this.getMaxAgeInSeconds());
        writer.writeStringValue("resource", this.getResource());
    }
    /**
     * Sets the allowedHeaders property value. The request headers that the origin domain may specify on the CORS request. The wildcard character * indicates that any header beginning with the specified prefix is allowed.
     * @param value Value to set for the allowedHeaders property.
     */
    public void setAllowedHeaders(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("allowedHeaders", value);
    }
    /**
     * Sets the allowedMethods property value. The HTTP request methods that the origin domain may use for a CORS request.
     * @param value Value to set for the allowedMethods property.
     */
    public void setAllowedMethods(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("allowedMethods", value);
    }
    /**
     * Sets the allowedOrigins property value. The origin domains that are permitted to make a request against the service via CORS. The origin domain is the domain from which the request originates. The origin must be an exact case-sensitive match with the origin that the user agent sends to the service.
     * @param value Value to set for the allowedOrigins property.
     */
    public void setAllowedOrigins(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("allowedOrigins", value);
    }
    /**
     * Sets the maxAgeInSeconds property value. The maximum amount of time that a browser should cache the response to the preflight OPTIONS request.
     * @param value Value to set for the maxAgeInSeconds property.
     */
    public void setMaxAgeInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maxAgeInSeconds", value);
    }
    /**
     * Sets the resource property value. Resource within the application segment for which CORS permissions are granted. / grants permission for the whole app segment.
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resource", value);
    }
}
