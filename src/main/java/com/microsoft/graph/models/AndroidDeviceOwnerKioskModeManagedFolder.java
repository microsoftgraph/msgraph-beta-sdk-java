package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A folder containing pages of apps and weblinks on the Managed Home Screen
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidDeviceOwnerKioskModeManagedFolder implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Unique identifier for the folder
     */
    private String folderIdentifier;
    /**
     * Display name for the folder
     */
    private String folderName;
    /**
     * Items to be added to managed folder. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<AndroidDeviceOwnerKioskModeFolderItem> items;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new AndroidDeviceOwnerKioskModeManagedFolder and sets the default values.
     */
    public AndroidDeviceOwnerKioskModeManagedFolder() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerKioskModeManagedFolder
     */
    @jakarta.annotation.Nonnull
    public static AndroidDeviceOwnerKioskModeManagedFolder createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerKioskModeManagedFolder();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
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
        deserializerMap.put("folderIdentifier", (n) -> { this.setFolderIdentifier(n.getStringValue()); });
        deserializerMap.put("folderName", (n) -> { this.setFolderName(n.getStringValue()); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(AndroidDeviceOwnerKioskModeFolderItem::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the folderIdentifier property value. Unique identifier for the folder
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFolderIdentifier() {
        return this.folderIdentifier;
    }
    /**
     * Gets the folderName property value. Display name for the folder
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFolderName() {
        return this.folderName;
    }
    /**
     * Gets the items property value. Items to be added to managed folder. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<AndroidDeviceOwnerKioskModeFolderItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerKioskModeFolderItem> getItems() {
        return this.items;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("folderIdentifier", this.getFolderIdentifier());
        writer.writeStringValue("folderName", this.getFolderName());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the folderIdentifier property value. Unique identifier for the folder
     * @param value Value to set for the folderIdentifier property.
     */
    public void setFolderIdentifier(@jakarta.annotation.Nullable final String value) {
        this.folderIdentifier = value;
    }
    /**
     * Sets the folderName property value. Display name for the folder
     * @param value Value to set for the folderName property.
     */
    public void setFolderName(@jakarta.annotation.Nullable final String value) {
        this.folderName = value;
    }
    /**
     * Sets the items property value. Items to be added to managed folder. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<AndroidDeviceOwnerKioskModeFolderItem> value) {
        this.items = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
