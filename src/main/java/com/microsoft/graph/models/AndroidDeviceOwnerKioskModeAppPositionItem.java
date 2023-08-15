package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * An item in the list of app positions that sets the order of items on the Managed Home Screen
 */
public class AndroidDeviceOwnerKioskModeAppPositionItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Represents an item on the Android Device Owner Managed Home Screen (application, weblink or folder
     */
    private AndroidDeviceOwnerKioskModeHomeScreenItem item;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Position of the item on the grid. Valid values 0 to 9999999
     */
    private Integer position;
    /**
     * Instantiates a new androidDeviceOwnerKioskModeAppPositionItem and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerKioskModeAppPositionItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidDeviceOwnerKioskModeAppPositionItem
     */
    @jakarta.annotation.Nonnull
    public static AndroidDeviceOwnerKioskModeAppPositionItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerKioskModeAppPositionItem();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("item", (n) -> { this.setItem(n.getObjectValue(AndroidDeviceOwnerKioskModeHomeScreenItem::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("position", (n) -> { this.setPosition(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the item property value. Represents an item on the Android Device Owner Managed Home Screen (application, weblink or folder
     * @return a androidDeviceOwnerKioskModeHomeScreenItem
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerKioskModeHomeScreenItem getItem() {
        return this.item;
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
     * Gets the position property value. Position of the item on the grid. Valid values 0 to 9999999
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPosition() {
        return this.position;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("item", this.getItem());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("position", this.getPosition());
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
     * Sets the item property value. Represents an item on the Android Device Owner Managed Home Screen (application, weblink or folder
     * @param value Value to set for the item property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setItem(@jakarta.annotation.Nullable final AndroidDeviceOwnerKioskModeHomeScreenItem value) {
        this.item = value;
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
     * Sets the position property value. Position of the item on the grid. Valid values 0 to 9999999
     * @param value Value to set for the position property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPosition(@jakarta.annotation.Nullable final Integer value) {
        this.position = value;
    }
}
