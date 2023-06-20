package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MobileAppSupersedence extends MobileAppRelationship implements Parsable {
    /** The total number of apps directly or indirectly superseded by the child app. */
    private Integer supersededAppCount;
    /** Indicates the supersedence type associated with a relationship between two mobile apps. */
    private MobileAppSupersedenceType supersedenceType;
    /** The total number of apps directly or indirectly superseding the parent app. */
    private Integer supersedingAppCount;
    /**
     * Instantiates a new MobileAppSupersedence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileAppSupersedence() {
        super();
        this.setOdataType("#microsoft.graph.mobileAppSupersedence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileAppSupersedence
     */
    @javax.annotation.Nonnull
    public static MobileAppSupersedence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppSupersedence();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("supersededAppCount", (n) -> { this.setSupersededAppCount(n.getIntegerValue()); });
        deserializerMap.put("supersedenceType", (n) -> { this.setSupersedenceType(n.getEnumValue(MobileAppSupersedenceType.class)); });
        deserializerMap.put("supersedingAppCount", (n) -> { this.setSupersedingAppCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the supersededAppCount property value. The total number of apps directly or indirectly superseded by the child app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSupersededAppCount() {
        return this.supersededAppCount;
    }
    /**
     * Gets the supersedenceType property value. Indicates the supersedence type associated with a relationship between two mobile apps.
     * @return a MobileAppSupersedenceType
     */
    @javax.annotation.Nullable
    public MobileAppSupersedenceType getSupersedenceType() {
        return this.supersedenceType;
    }
    /**
     * Gets the supersedingAppCount property value. The total number of apps directly or indirectly superseding the parent app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSupersedingAppCount() {
        return this.supersedingAppCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("supersededAppCount", this.getSupersededAppCount());
        writer.writeEnumValue("supersedenceType", this.getSupersedenceType());
        writer.writeIntegerValue("supersedingAppCount", this.getSupersedingAppCount());
    }
    /**
     * Sets the supersededAppCount property value. The total number of apps directly or indirectly superseded by the child app.
     * @param value Value to set for the supersededAppCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupersededAppCount(@javax.annotation.Nullable final Integer value) {
        this.supersededAppCount = value;
    }
    /**
     * Sets the supersedenceType property value. Indicates the supersedence type associated with a relationship between two mobile apps.
     * @param value Value to set for the supersedenceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupersedenceType(@javax.annotation.Nullable final MobileAppSupersedenceType value) {
        this.supersedenceType = value;
    }
    /**
     * Sets the supersedingAppCount property value. The total number of apps directly or indirectly superseding the parent app.
     * @param value Value to set for the supersedingAppCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupersedingAppCount(@javax.annotation.Nullable final Integer value) {
        this.supersedingAppCount = value;
    }
}
