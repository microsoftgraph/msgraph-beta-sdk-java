package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProtectSite extends LabelActionBase implements Parsable {
    /** The accessType property */
    private SiteAccessType _accessType;
    /** The conditionalAccessProtectionLevelId property */
    private String _conditionalAccessProtectionLevelId;
    /**
     * Instantiates a new ProtectSite and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProtectSite() {
        super();
        this.setOdataType("#microsoft.graph.protectSite");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProtectSite
     */
    @javax.annotation.Nonnull
    public static ProtectSite createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProtectSite();
    }
    /**
     * Gets the accessType property value. The accessType property
     * @return a siteAccessType
     */
    @javax.annotation.Nullable
    public SiteAccessType getAccessType() {
        return this._accessType;
    }
    /**
     * Gets the conditionalAccessProtectionLevelId property value. The conditionalAccessProtectionLevelId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConditionalAccessProtectionLevelId() {
        return this._conditionalAccessProtectionLevelId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ProtectSite currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessType", (n) -> { currentObject.setAccessType(n.getEnumValue(SiteAccessType.class)); });
        deserializerMap.put("conditionalAccessProtectionLevelId", (n) -> { currentObject.setConditionalAccessProtectionLevelId(n.getStringValue()); });
        return deserializerMap
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
        writer.writeEnumValue("accessType", this.getAccessType());
        writer.writeStringValue("conditionalAccessProtectionLevelId", this.getConditionalAccessProtectionLevelId());
    }
    /**
     * Sets the accessType property value. The accessType property
     * @param value Value to set for the accessType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessType(@javax.annotation.Nullable final SiteAccessType value) {
        this._accessType = value;
    }
    /**
     * Sets the conditionalAccessProtectionLevelId property value. The conditionalAccessProtectionLevelId property
     * @param value Value to set for the conditionalAccessProtectionLevelId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConditionalAccessProtectionLevelId(@javax.annotation.Nullable final String value) {
        this._conditionalAccessProtectionLevelId = value;
    }
}
