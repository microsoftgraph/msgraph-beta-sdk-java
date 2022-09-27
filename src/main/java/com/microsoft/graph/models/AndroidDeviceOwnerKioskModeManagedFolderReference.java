package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidDeviceOwnerKioskModeManagedFolderReference extends AndroidDeviceOwnerKioskModeHomeScreenItem implements Parsable {
    /** Unique identifier for the folder */
    private String _folderIdentifier;
    /** Name of the folder */
    private String _folderName;
    /**
     * Instantiates a new AndroidDeviceOwnerKioskModeManagedFolderReference and sets the default values.
     * @return a void
     */
    public AndroidDeviceOwnerKioskModeManagedFolderReference() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerKioskModeManagedFolderReference");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerKioskModeManagedFolderReference
     */
    @javax.annotation.Nonnull
    public static AndroidDeviceOwnerKioskModeManagedFolderReference createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerKioskModeManagedFolderReference();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidDeviceOwnerKioskModeManagedFolderReference currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("folderIdentifier", (n) -> { currentObject.setFolderIdentifier(n.getStringValue()); });
            this.put("folderName", (n) -> { currentObject.setFolderName(n.getStringValue()); });
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
     * Gets the folderName property value. Name of the folder
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFolderName() {
        return this._folderName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("folderIdentifier", this.getFolderIdentifier());
        writer.writeStringValue("folderName", this.getFolderName());
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
     * Sets the folderName property value. Name of the folder
     * @param value Value to set for the folderName property.
     * @return a void
     */
    public void setFolderName(@javax.annotation.Nullable final String value) {
        this._folderName = value;
    }
}
