package com.microsoft.graph.devicemanagement.androidforworkenrollmentprofiles.item.createtoken;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CreateTokenPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The tokenValidityInSeconds property */
    private Integer tokenValidityInSeconds;
    /**
     * Instantiates a new createTokenPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CreateTokenPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a createTokenPostRequestBody
     */
    @javax.annotation.Nonnull
    public static CreateTokenPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateTokenPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("tokenValidityInSeconds", (n) -> { this.setTokenValidityInSeconds(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the tokenValidityInSeconds property value. The tokenValidityInSeconds property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTokenValidityInSeconds() {
        return this.tokenValidityInSeconds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("tokenValidityInSeconds", this.getTokenValidityInSeconds());
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
     * Sets the tokenValidityInSeconds property value. The tokenValidityInSeconds property
     * @param value Value to set for the tokenValidityInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTokenValidityInSeconds(@javax.annotation.Nullable final Integer value) {
        this.tokenValidityInSeconds = value;
    }
}
