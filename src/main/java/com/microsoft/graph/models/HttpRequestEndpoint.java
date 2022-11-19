package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class HttpRequestEndpoint extends CustomExtensionEndpointConfiguration implements Parsable {
    /** The targetUrl property */
    private String _targetUrl;
    /**
     * Instantiates a new HttpRequestEndpoint and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public HttpRequestEndpoint() {
        super();
        this.setOdataType("#microsoft.graph.httpRequestEndpoint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a HttpRequestEndpoint
     */
    @javax.annotation.Nonnull
    public static HttpRequestEndpoint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HttpRequestEndpoint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HttpRequestEndpoint currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("targetUrl", (n) -> { currentObject.setTargetUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the targetUrl property value. The targetUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetUrl() {
        return this._targetUrl;
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
        writer.writeStringValue("targetUrl", this.getTargetUrl());
    }
    /**
     * Sets the targetUrl property value. The targetUrl property
     * @param value Value to set for the targetUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetUrl(@javax.annotation.Nullable final String value) {
        this._targetUrl = value;
    }
}
