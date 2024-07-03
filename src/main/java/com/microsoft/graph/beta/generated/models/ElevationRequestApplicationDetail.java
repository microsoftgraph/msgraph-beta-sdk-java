package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The details of the application which the user has requested to elevate
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ElevationRequestApplicationDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ElevationRequestApplicationDetail} and sets the default values.
     */
    public ElevationRequestApplicationDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ElevationRequestApplicationDetail}
     */
    @jakarta.annotation.Nonnull
    public static ElevationRequestApplicationDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ElevationRequestApplicationDetail();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("fileDescription", (n) -> { this.setFileDescription(n.getStringValue()); });
        deserializerMap.put("fileHash", (n) -> { this.setFileHash(n.getStringValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("filePath", (n) -> { this.setFilePath(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("productInternalName", (n) -> { this.setProductInternalName(n.getStringValue()); });
        deserializerMap.put("productName", (n) -> { this.setProductName(n.getStringValue()); });
        deserializerMap.put("productVersion", (n) -> { this.setProductVersion(n.getStringValue()); });
        deserializerMap.put("publisherCert", (n) -> { this.setPublisherCert(n.getStringValue()); });
        deserializerMap.put("publisherName", (n) -> { this.setPublisherName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileDescription property value. The path of the file in the request for elevation, for example, %programfiles%/git/cmd
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileDescription() {
        return this.backingStore.get("fileDescription");
    }
    /**
     * Gets the fileHash property value. The SHA256 hash of the file in the request for elevation, for example, '18ee24150dcb1d96752a4d6dd0f20dfd8ba8c38527e40aa8509b7adecf78f9c6'
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileHash() {
        return this.backingStore.get("fileHash");
    }
    /**
     * Gets the fileName property value. The name of the file in the request for elevation, for example, git.exe
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.backingStore.get("fileName");
    }
    /**
     * Gets the filePath property value. The path of the file in the request for elevation, for example, %programfiles%/git/cmd
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFilePath() {
        return this.backingStore.get("filePath");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the productInternalName property value. The internal name of the application for which elevation request has been made. For example, 'git'
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductInternalName() {
        return this.backingStore.get("productInternalName");
    }
    /**
     * Gets the productName property value. The product name of the application for which elevation request has been made. For example, 'Git'
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductName() {
        return this.backingStore.get("productName");
    }
    /**
     * Gets the productVersion property value. The product version of the application for which elevation request has been made. For example, '2.40.1.0'
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductVersion() {
        return this.backingStore.get("productVersion");
    }
    /**
     * Gets the publisherCert property value. The list of base64 encoded certificate for each signer, for example, string[encodedleafcert1, encodedleafcert2....]
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPublisherCert() {
        return this.backingStore.get("publisherCert");
    }
    /**
     * Gets the publisherName property value. The certificate issuer name of the certificate used to sign the application, for example, 'Sectigo Public Code Signing CA R36'
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPublisherName() {
        return this.backingStore.get("publisherName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("fileDescription", this.getFileDescription());
        writer.writeStringValue("fileHash", this.getFileHash());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeStringValue("filePath", this.getFilePath());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("productInternalName", this.getProductInternalName());
        writer.writeStringValue("productName", this.getProductName());
        writer.writeStringValue("productVersion", this.getProductVersion());
        writer.writeStringValue("publisherCert", this.getPublisherCert());
        writer.writeStringValue("publisherName", this.getPublisherName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the fileDescription property value. The path of the file in the request for elevation, for example, %programfiles%/git/cmd
     * @param value Value to set for the fileDescription property.
     */
    public void setFileDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileDescription", value);
    }
    /**
     * Sets the fileHash property value. The SHA256 hash of the file in the request for elevation, for example, '18ee24150dcb1d96752a4d6dd0f20dfd8ba8c38527e40aa8509b7adecf78f9c6'
     * @param value Value to set for the fileHash property.
     */
    public void setFileHash(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileHash", value);
    }
    /**
     * Sets the fileName property value. The name of the file in the request for elevation, for example, git.exe
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileName", value);
    }
    /**
     * Sets the filePath property value. The path of the file in the request for elevation, for example, %programfiles%/git/cmd
     * @param value Value to set for the filePath property.
     */
    public void setFilePath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("filePath", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the productInternalName property value. The internal name of the application for which elevation request has been made. For example, 'git'
     * @param value Value to set for the productInternalName property.
     */
    public void setProductInternalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productInternalName", value);
    }
    /**
     * Sets the productName property value. The product name of the application for which elevation request has been made. For example, 'Git'
     * @param value Value to set for the productName property.
     */
    public void setProductName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productName", value);
    }
    /**
     * Sets the productVersion property value. The product version of the application for which elevation request has been made. For example, '2.40.1.0'
     * @param value Value to set for the productVersion property.
     */
    public void setProductVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productVersion", value);
    }
    /**
     * Sets the publisherCert property value. The list of base64 encoded certificate for each signer, for example, string[encodedleafcert1, encodedleafcert2....]
     * @param value Value to set for the publisherCert property.
     */
    public void setPublisherCert(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("publisherCert", value);
    }
    /**
     * Sets the publisherName property value. The certificate issuer name of the certificate used to sign the application, for example, 'Sectigo Public Code Signing CA R36'
     * @param value Value to set for the publisherName property.
     */
    public void setPublisherName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("publisherName", value);
    }
}
