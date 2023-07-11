package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WebApplicationSegment extends ApplicationSegment implements Parsable {
    /**
     * If you're configuring a traffic manager in front of multiple App Proxy application segments, this property contains the user-friendly URL that will point to the traffic manager.
     */
    private String alternateUrl;
    /**
     * A collection of CORS Rule definitions for a particular application segment.
     */
    private java.util.List<CorsConfigurationV2> corsConfigurations;
    /**
     * The published external URL for the application segment; for example, https://intranet.contoso.com/.
     */
    private String externalUrl;
    /**
     * The internal URL of the application segment; for example, https://intranet/.
     */
    private String internalUrl;
    /**
     * Instantiates a new webApplicationSegment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WebApplicationSegment() {
        super();
        this.setOdataType("#microsoft.graph.webApplicationSegment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a webApplicationSegment
     */
    @javax.annotation.Nonnull
    public static WebApplicationSegment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebApplicationSegment();
    }
    /**
     * Gets the alternateUrl property value. If you're configuring a traffic manager in front of multiple App Proxy application segments, this property contains the user-friendly URL that will point to the traffic manager.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlternateUrl() {
        return this.alternateUrl;
    }
    /**
     * Gets the corsConfigurations property value. A collection of CORS Rule definitions for a particular application segment.
     * @return a CorsConfigurationV2
     */
    @javax.annotation.Nullable
    public java.util.List<CorsConfigurationV2> getCorsConfigurations() {
        return this.corsConfigurations;
    }
    /**
     * Gets the externalUrl property value. The published external URL for the application segment; for example, https://intranet.contoso.com/.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalUrl() {
        return this.externalUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alternateUrl", (n) -> { this.setAlternateUrl(n.getStringValue()); });
        deserializerMap.put("corsConfigurations", (n) -> { this.setCorsConfigurations(n.getCollectionOfObjectValues(CorsConfigurationV2::createFromDiscriminatorValue)); });
        deserializerMap.put("externalUrl", (n) -> { this.setExternalUrl(n.getStringValue()); });
        deserializerMap.put("internalUrl", (n) -> { this.setInternalUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the internalUrl property value. The internal URL of the application segment; for example, https://intranet/.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInternalUrl() {
        return this.internalUrl;
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
        writer.writeStringValue("alternateUrl", this.getAlternateUrl());
        writer.writeCollectionOfObjectValues("corsConfigurations", this.getCorsConfigurations());
        writer.writeStringValue("externalUrl", this.getExternalUrl());
        writer.writeStringValue("internalUrl", this.getInternalUrl());
    }
    /**
     * Sets the alternateUrl property value. If you're configuring a traffic manager in front of multiple App Proxy application segments, this property contains the user-friendly URL that will point to the traffic manager.
     * @param value Value to set for the alternateUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlternateUrl(@javax.annotation.Nullable final String value) {
        this.alternateUrl = value;
    }
    /**
     * Sets the corsConfigurations property value. A collection of CORS Rule definitions for a particular application segment.
     * @param value Value to set for the corsConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCorsConfigurations(@javax.annotation.Nullable final java.util.List<CorsConfigurationV2> value) {
        this.corsConfigurations = value;
    }
    /**
     * Sets the externalUrl property value. The published external URL for the application segment; for example, https://intranet.contoso.com/.
     * @param value Value to set for the externalUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalUrl(@javax.annotation.Nullable final String value) {
        this.externalUrl = value;
    }
    /**
     * Sets the internalUrl property value. The internal URL of the application segment; for example, https://intranet/.
     * @param value Value to set for the internalUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternalUrl(@javax.annotation.Nullable final String value) {
        this.internalUrl = value;
    }
}
