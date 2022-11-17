package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** An item in the list of app positions that sets the order of items on the Managed Home Screen */
public class AndroidDeviceOwnerKioskModeAppPositionItem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Represents an item on the Android Device Owner Managed Home Screen (application, weblink or folder */
    private AndroidDeviceOwnerKioskModeHomeScreenItem _item;
    /** The OdataType property */
    private String _odataType;
    /** Position of the item on the grid. Valid values 0 to 9999999 */
    private Integer _position;
    /**
     * Instantiates a new androidDeviceOwnerKioskModeAppPositionItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerKioskModeAppPositionItem() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.androidDeviceOwnerKioskModeAppPositionItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidDeviceOwnerKioskModeAppPositionItem
     */
    @javax.annotation.Nonnull
    public static AndroidDeviceOwnerKioskModeAppPositionItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerKioskModeAppPositionItem();
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
        final AndroidDeviceOwnerKioskModeAppPositionItem currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("item", (n) -> { currentObject.setItem(n.getObjectValue(AndroidDeviceOwnerKioskModeHomeScreenItem::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("position", (n) -> { currentObject.setPosition(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the item property value. Represents an item on the Android Device Owner Managed Home Screen (application, weblink or folder
     * @return a androidDeviceOwnerKioskModeHomeScreenItem
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerKioskModeHomeScreenItem getItem() {
        return this._item;
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
     * Gets the position property value. Position of the item on the grid. Valid values 0 to 9999999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPosition() {
        return this._position;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("item", this.getItem());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("position", this.getPosition());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the item property value. Represents an item on the Android Device Owner Managed Home Screen (application, weblink or folder
     * @param value Value to set for the item property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItem(@javax.annotation.Nullable final AndroidDeviceOwnerKioskModeHomeScreenItem value) {
        this._item = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the position property value. Position of the item on the grid. Valid values 0 to 9999999
     * @param value Value to set for the position property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPosition(@javax.annotation.Nullable final Integer value) {
        this._position = value;
    }
}
