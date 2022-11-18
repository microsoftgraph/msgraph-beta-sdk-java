package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InternetExplorerMode extends Entity implements Parsable {
    /** A collection of site lists to support Internet Explorer mode. */
    private java.util.List<BrowserSiteList> _siteLists;
    /**
     * Instantiates a new internetExplorerMode and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public InternetExplorerMode() {
        super();
        this.setOdataType("#microsoft.graph.internetExplorerMode");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a internetExplorerMode
     */
    @javax.annotation.Nonnull
    public static InternetExplorerMode createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InternetExplorerMode();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final InternetExplorerMode currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("siteLists", (n) -> { currentObject.setSiteLists(n.getCollectionOfObjectValues(BrowserSiteList::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the siteLists property value. A collection of site lists to support Internet Explorer mode.
     * @return a browserSiteList
     */
    @javax.annotation.Nullable
    public java.util.List<BrowserSiteList> getSiteLists() {
        return this._siteLists;
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
        writer.writeCollectionOfObjectValues("siteLists", this.getSiteLists());
    }
    /**
     * Sets the siteLists property value. A collection of site lists to support Internet Explorer mode.
     * @param value Value to set for the siteLists property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiteLists(@javax.annotation.Nullable final java.util.List<BrowserSiteList> value) {
        this._siteLists = value;
    }
}
