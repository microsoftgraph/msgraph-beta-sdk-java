package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Headers implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Represents the origin or source from which the request is being made.
     */
    private String origin;
    /**
     * Represents the referring URL or the URL of the web page that the current request originates from.
     */
    private String referrer;
    /**
     * Represents the information about the client original IP address when the request passes through one or more proxy servers or load balancers.
     */
    private String xForwardedFor;
    /**
     * Instantiates a new headers and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Headers() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a headers
     */
    @jakarta.annotation.Nonnull
    public static Headers createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Headers();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("origin", (n) -> { this.setOrigin(n.getStringValue()); });
        deserializerMap.put("referrer", (n) -> { this.setReferrer(n.getStringValue()); });
        deserializerMap.put("xForwardedFor", (n) -> { this.setXForwardedFor(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the origin property value. Represents the origin or source from which the request is being made.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOrigin() {
        return this.origin;
    }
    /**
     * Gets the referrer property value. Represents the referring URL or the URL of the web page that the current request originates from.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getReferrer() {
        return this.referrer;
    }
    /**
     * Gets the xForwardedFor property value. Represents the information about the client original IP address when the request passes through one or more proxy servers or load balancers.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getXForwardedFor() {
        return this.xForwardedFor;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("origin", this.getOrigin());
        writer.writeStringValue("referrer", this.getReferrer());
        writer.writeStringValue("xForwardedFor", this.getXForwardedFor());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the origin property value. Represents the origin or source from which the request is being made.
     * @param value Value to set for the origin property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOrigin(@jakarta.annotation.Nullable final String value) {
        this.origin = value;
    }
    /**
     * Sets the referrer property value. Represents the referring URL or the URL of the web page that the current request originates from.
     * @param value Value to set for the referrer property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setReferrer(@jakarta.annotation.Nullable final String value) {
        this.referrer = value;
    }
    /**
     * Sets the xForwardedFor property value. Represents the information about the client original IP address when the request passes through one or more proxy servers or load balancers.
     * @param value Value to set for the xForwardedFor property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setXForwardedFor(@jakarta.annotation.Nullable final String value) {
        this.xForwardedFor = value;
    }
}
