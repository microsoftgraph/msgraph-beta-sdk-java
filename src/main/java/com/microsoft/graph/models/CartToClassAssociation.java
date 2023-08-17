package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * CartToClassAssociation for associating device carts with classrooms.
 */
public class CartToClassAssociation extends Entity implements Parsable {
    /**
     * Identifiers of classrooms to be associated with device carts.
     */
    private java.util.List<String> classroomIds;
    /**
     * DateTime the object was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Admin provided description of the CartToClassAssociation.
     */
    private String description;
    /**
     * Identifiers of device carts to be associated with classes.
     */
    private java.util.List<String> deviceCartIds;
    /**
     * Admin provided name of the device configuration.
     */
    private String displayName;
    /**
     * DateTime the object was last modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Version of the CartToClassAssociation.
     */
    private Integer version;
    /**
     * Instantiates a new cartToClassAssociation and sets the default values.
     */
    public CartToClassAssociation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cartToClassAssociation
     */
    @jakarta.annotation.Nonnull
    public static CartToClassAssociation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CartToClassAssociation();
    }
    /**
     * Gets the classroomIds property value. Identifiers of classrooms to be associated with device carts.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getClassroomIds() {
        return this.classroomIds;
    }
    /**
     * Gets the createdDateTime property value. DateTime the object was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. Admin provided description of the CartToClassAssociation.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the deviceCartIds property value. Identifiers of device carts to be associated with classes.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDeviceCartIds() {
        return this.deviceCartIds;
    }
    /**
     * Gets the displayName property value. Admin provided name of the device configuration.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("classroomIds", (n) -> { this.setClassroomIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceCartIds", (n) -> { this.setDeviceCartIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the version property value. Version of the CartToClassAssociation.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("classroomIds", this.getClassroomIds());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfPrimitiveValues("deviceCartIds", this.getDeviceCartIds());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the classroomIds property value. Identifiers of classrooms to be associated with device carts.
     * @param value Value to set for the classroomIds property.
     */
    public void setClassroomIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.classroomIds = value;
    }
    /**
     * Sets the createdDateTime property value. DateTime the object was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Admin provided description of the CartToClassAssociation.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the deviceCartIds property value. Identifiers of device carts to be associated with classes.
     * @param value Value to set for the deviceCartIds property.
     */
    public void setDeviceCartIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.deviceCartIds = value;
    }
    /**
     * Sets the displayName property value. Admin provided name of the device configuration.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the version property value. Version of the CartToClassAssociation.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.version = value;
    }
}
