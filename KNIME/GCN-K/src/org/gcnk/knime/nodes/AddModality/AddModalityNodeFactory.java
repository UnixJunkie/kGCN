package org.gcnk.knime.nodes.AddModality;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "AddModality" Node.
 * 
 *
 * @author org.gcnk
 */
public class AddModalityNodeFactory 
        extends NodeFactory<AddModalityNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public AddModalityNodeModel createNodeModel() {
        return new AddModalityNodeModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNrNodeViews() {
        return 1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeView<AddModalityNodeModel> createNodeView(final int viewIndex,
            final AddModalityNodeModel nodeModel) {
        return new AddModalityNodeView(nodeModel);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasDialog() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeDialogPane createNodeDialogPane() {
        return new AddModalityNodeDialog();
    }

}
