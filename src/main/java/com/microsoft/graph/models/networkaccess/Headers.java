package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Headers implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The OdataType property */
    private String odataType;
    /** The origin property */
    private String origin;
    /** The referrer property */
    private String referrer;
    /** The xForwardedFor property */
    private String xForwardedFor;
    /**
     * Instantiates a new headers and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Headers() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a headers
     */
    @javax.annotation.Nonnull
    public static Headers createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Headers();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the origin property value. The origin property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrigin() {
        return this.origin;
    }
    /**
     * Gets the referrer property value. The referrer property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReferrer() {
        return this.referrer;
    }
    /**
     * Gets the xForwardedFor property value. The xForwardedFor property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getXForwardedFor() {
        return this.xForwardedFor;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("origin", this.getOrigin());
        writer.writeStringValue("referrer", this.getReferrer());
        writer.writeStringValue("xForwardedFor", this.getXForwardedFor());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the origin property value. The origin property
     * @param value Value to set for the origin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrigin(@javax.annotation.Nullable final String value) {
        this.origin = value;
    }
    /**
     * Sets the referrer property value. The referrer property
     * @param value Value to set for the referrer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReferrer(@javax.annotation.Nullable final String value) {
        this.referrer = value;
    }
    /**
     * Sets the xForwardedFor property value. The xForwardedFor property
     * @param value Value to set for the xForwardedFor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setXForwardedFor(@javax.annotation.Nullable final String value) {
        this.xForwardedFor = value;
    }
}
