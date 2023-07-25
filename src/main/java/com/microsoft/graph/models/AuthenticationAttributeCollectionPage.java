package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationAttributeCollectionPage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The customStringsFileId property
     */
    private String customStringsFileId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * A collection of displays of the attribute collection page.
     */
    private java.util.List<AuthenticationAttributeCollectionPageViewConfiguration> views;
    /**
     * Instantiates a new authenticationAttributeCollectionPage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationAttributeCollectionPage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationAttributeCollectionPage
     */
    @javax.annotation.Nonnull
    public static AuthenticationAttributeCollectionPage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationAttributeCollectionPage();
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
     * Gets the customStringsFileId property value. The customStringsFileId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomStringsFileId() {
        return this.customStringsFileId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("customStringsFileId", (n) -> { this.setCustomStringsFileId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("views", (n) -> { this.setViews(n.getCollectionOfObjectValues(AuthenticationAttributeCollectionPageViewConfiguration::createFromDiscriminatorValue)); });
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
     * Gets the views property value. A collection of displays of the attribute collection page.
     * @return a authenticationAttributeCollectionPageViewConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationAttributeCollectionPageViewConfiguration> getViews() {
        return this.views;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("customStringsFileId", this.getCustomStringsFileId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("views", this.getViews());
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
     * Sets the customStringsFileId property value. The customStringsFileId property
     * @param value Value to set for the customStringsFileId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomStringsFileId(@javax.annotation.Nullable final String value) {
        this.customStringsFileId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the views property value. A collection of displays of the attribute collection page.
     * @param value Value to set for the views property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setViews(@javax.annotation.Nullable final java.util.List<AuthenticationAttributeCollectionPageViewConfiguration> value) {
        this.views = value;
    }
}
