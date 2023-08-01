package com.microsoft.graph.trustframework.keysets.item.generatekey;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GenerateKeyPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The exp property
     */
    private Long exp;
    /**
     * The kty property
     */
    private String kty;
    /**
     * The nbf property
     */
    private Long nbf;
    /**
     * The use property
     */
    private String use;
    /**
     * Instantiates a new generateKeyPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GenerateKeyPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a generateKeyPostRequestBody
     */
    @javax.annotation.Nonnull
    public static GenerateKeyPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GenerateKeyPostRequestBody();
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
     * Gets the exp property value. The exp property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getExp() {
        return this.exp;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("exp", (n) -> { this.setExp(n.getLongValue()); });
        deserializerMap.put("kty", (n) -> { this.setKty(n.getStringValue()); });
        deserializerMap.put("nbf", (n) -> { this.setNbf(n.getLongValue()); });
        deserializerMap.put("use", (n) -> { this.setUse(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the kty property value. The kty property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKty() {
        return this.kty;
    }
    /**
     * Gets the nbf property value. The nbf property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getNbf() {
        return this.nbf;
    }
    /**
     * Gets the use property value. The use property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUse() {
        return this.use;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("exp", this.getExp());
        writer.writeStringValue("kty", this.getKty());
        writer.writeLongValue("nbf", this.getNbf());
        writer.writeStringValue("use", this.getUse());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the exp property value. The exp property
     * @param value Value to set for the exp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExp(@javax.annotation.Nullable final Long value) {
        this.exp = value;
    }
    /**
     * Sets the kty property value. The kty property
     * @param value Value to set for the kty property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKty(@javax.annotation.Nullable final String value) {
        this.kty = value;
    }
    /**
     * Sets the nbf property value. The nbf property
     * @param value Value to set for the nbf property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNbf(@javax.annotation.Nullable final Long value) {
        this.nbf = value;
    }
    /**
     * Sets the use property value. The use property
     * @param value Value to set for the use property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUse(@javax.annotation.Nullable final String value) {
        this.use = value;
    }
}
