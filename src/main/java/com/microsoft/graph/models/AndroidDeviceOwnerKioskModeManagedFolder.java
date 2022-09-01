package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A folder containing pages of apps and weblinks on the Managed Home Screen */
public class AndroidDeviceOwnerKioskModeManagedFolder implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Unique identifier for the folder */
    private String _folderIdentifier;
    /** Display name for the folder */
    private String _folderName;
    /** Items to be added to managed folder. This collection can contain a maximum of 500 elements. */
    private java.util.List<AndroidDeviceOwnerKioskModeFolderItem> _items;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new androidDeviceOwnerKioskModeManagedFolder and sets the default values.
     * @return a void
     */
    public AndroidDeviceOwnerKioskModeManagedFolder() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.androidDeviceOwnerKioskModeManagedFolder");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidDeviceOwnerKioskModeManagedFolder
     */
    @javax.annotation.Nonnull
    public static AndroidDeviceOwnerKioskModeManagedFolder createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerKioskModeManagedFolder();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidDeviceOwnerKioskModeManagedFolder currentObject = this;
        return new HashMap<>(4) {{
            this.put("folderIdentifier", (n) -> { currentObject.setFolderIdentifier(n.getStringValue()); });
            this.put("folderName", (n) -> { currentObject.setFolderName(n.getStringValue()); });
            this.put("items", (n) -> { currentObject.setItems(n.getCollectionOfObjectValues(AndroidDeviceOwnerKioskModeFolderItem::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the folderIdentifier property value. Unique identifier for the folder
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFolderIdentifier() {
        return this._folderIdentifier;
    }
    /**
     * Gets the folderName property value. Display name for the folder
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFolderName() {
        return this._folderName;
    }
    /**
     * Gets the items property value. Items to be added to managed folder. This collection can contain a maximum of 500 elements.
     * @return a androidDeviceOwnerKioskModeFolderItem
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerKioskModeFolderItem> getItems() {
        return this._items;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("folderIdentifier", this.getFolderIdentifier());
        writer.writeStringValue("folderName", this.getFolderName());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the folderIdentifier property value. Unique identifier for the folder
     * @param value Value to set for the folderIdentifier property.
     * @return a void
     */
    public void setFolderIdentifier(@javax.annotation.Nullable final String value) {
        this._folderIdentifier = value;
    }
    /**
     * Sets the folderName property value. Display name for the folder
     * @param value Value to set for the folderName property.
     * @return a void
     */
    public void setFolderName(@javax.annotation.Nullable final String value) {
        this._folderName = value;
    }
    /**
     * Sets the items property value. Items to be added to managed folder. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the items property.
     * @return a void
     */
    public void setItems(@javax.annotation.Nullable final java.util.List<AndroidDeviceOwnerKioskModeFolderItem> value) {
        this._items = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
