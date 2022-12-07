package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosWebContentFilterAutoFilter extends IosWebContentFilterBase implements Parsable {
    /** Additional URLs allowed for access */
    private java.util.List<String> _allowedUrls;
    /** Additional URLs blocked for access */
    private java.util.List<String> _blockedUrls;
    /**
     * Instantiates a new IosWebContentFilterAutoFilter and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosWebContentFilterAutoFilter() {
        super();
        this.setOdataType("#microsoft.graph.iosWebContentFilterAutoFilter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosWebContentFilterAutoFilter
     */
    @javax.annotation.Nonnull
    public static IosWebContentFilterAutoFilter createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosWebContentFilterAutoFilter();
    }
    /**
     * Gets the allowedUrls property value. Additional URLs allowed for access
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedUrls() {
        return this._allowedUrls;
    }
    /**
     * Gets the blockedUrls property value. Additional URLs blocked for access
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getBlockedUrls() {
        return this._blockedUrls;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedUrls", (n) -> { this.setAllowedUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("blockedUrls", (n) -> { this.setBlockedUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
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
        writer.writeCollectionOfPrimitiveValues("allowedUrls", this.getAllowedUrls());
        writer.writeCollectionOfPrimitiveValues("blockedUrls", this.getBlockedUrls());
    }
    /**
     * Sets the allowedUrls property value. Additional URLs allowed for access
     * @param value Value to set for the allowedUrls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedUrls = value;
    }
    /**
     * Sets the blockedUrls property value. Additional URLs blocked for access
     * @param value Value to set for the blockedUrls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlockedUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._blockedUrls = value;
    }
}
